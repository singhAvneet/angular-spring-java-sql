package api.mssql.demo.repository;


import api.mssql.demo.Model.Book;
import api.mssql.demo.Model.Paper;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    //exec CIMS.dbo.Financial_PrintMultiGroupBill;1 326611,'2020-03-01 00:00:00',0
    @Query(value="exec CIMS.dbo.Financial_PrintMultiGroupBill;1 :#{#paper.getGroupid()}, :#{#paper.getPeriodmonth()}, 0", nativeQuery = true)
    List<Book> findAll(@Param("paper") Paper paper);
}







