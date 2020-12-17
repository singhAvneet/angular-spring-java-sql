import { Component,OnInit, ViewChild } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import {data} from './data';
import {Book} from './Model/book';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [Book],
})
export class AppComponent {
  title = 'CreatePDF';
  array;
  checkbox=false;
  show=false;
  Data=data;
  // dataset=Book;
  constructor(private https: HttpClient, private dataset: Book) { }

   search(){
     this.show=true;
    this.dataset.InvoiceDate+="-01";
    console.log(this.dataset.InvoiceDate)

      this.https.post('http://localhost:9523/createInvoice',this.dataset, {responseType: 'arraybuffer'})
      .subscribe(function (data) {
        this.show=false;
          var file = new Blob([data], {type: 'application/pdf'});
          var fileURL = URL.createObjectURL(file);   
               
          window.open(fileURL); 
          window.location.reload();     
   });
   }


   print(Dataa){
    this.show=true;
    if(this.checkbox){
      this.Data=JSON.parse(Dataa)
    }
     this.https.post('https://hub.gms.ca/cims/uat/group/invoice/pdf/createhcsainvoice' ,this.Data, {responseType: 'arraybuffer'})
     .subscribe(function (data) {
       this.show=false;
         var file = new Blob([data], {type: 'application/pdf'});
         var fileURL = URL.createObjectURL(file);   
              
         window.open(fileURL); 
         window.location.reload();     
  });
  }


}

