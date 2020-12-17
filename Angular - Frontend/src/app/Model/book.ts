export class Book implements bookInterface{
  ContractId=null;  
  InvoiceDate=null; 
  InvoiceDetail=true; 
  Supplemental=true;
}










interface bookInterface
{
  
  ContractId:string;
  InvoiceDate:string;
  InvoiceDetail:boolean; 
  Supplemental:boolean;
}
