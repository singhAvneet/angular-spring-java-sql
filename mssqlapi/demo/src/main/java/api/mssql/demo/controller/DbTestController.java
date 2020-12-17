package api.mssql.demo.controller;

import api.mssql.demo.Model.Book;
import api.mssql.demo.Model.Paper;
import api.mssql.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DbTestController {

    @Autowired
    DataSource dataSource;

    @RequestMapping(value = "dbtest", produces = "text/plain")
    @ResponseBody
    public String testDb() throws SQLException {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT 1+1")) {
            rs.next();
            int two = rs.getInt(1);
            return "Database connectivity seems " + (two == 2 ? "OK." : "weird!");
        }
    }

    @Autowired
    BookRepository bookRepository;

    @PostMapping("/books")
    public @ResponseBody List<Book> savePDF(@RequestBody Paper paper)  {
        System.out.println("executing sql query...");
        return (List<Book>) bookRepository.findAll(paper);
    }

}