create database lab6;
use lab6;

/* create table customer   */
create table customer(custId varchar(50)  primary key, first_name varchar(100),
                      last_name varchar(100), email varchar(100),
                      dob varchar(30) , city varchar(100), country varchar(100),
                      address varchar(100), pincode int not null
);

select *from customer;

#drop table customer;


/* create a table for bank account */
create table BankAccount(accountNbr varchar(50) not null,balance double,
bank_code varchar(100),branch_code varchar(100),
                         account_type varchar(20),
                         custId varchar(50) not null,
                         primary key(accountNbr),
                         foreign key (custId) references customer(custId));
                         
select *from bankaccount;

# drop table bankaccount;



#  create a table for account statement
create table account_statement(AccStmId varchar(50) not null primary key,
 amount double,isDebit varchar(20), transactionRefNumber varchar(50),
                              description varchar(255),txn_date varchar(20),
                              accountNbr varchar(50), foreign key(accountNbr) references bankaccount(accountNbr),
                              custId varchar(50), foreign key(custId) references bankaccount(custId)
                              );
                             
select *from account_statement;

drop table account_statement;


/* Enter the values for the customer table */

insert into customer values(100,"yeshwanth","kumar","yeswanth.kumar@gmail.com",2003,"Chennai","India","Bank Street",574003);
insert into customer values(101,"abilash","T","abilash.g@gmail.com",2001,"Bangalore","India","Marathahalli",664100);
insert into customer values(102,"Bharath","R","ravula.bharath@gmail.com",1998,"Mumbai","India","",540000);
insert into customer values(103,"Chaitanya","Y","yella.chaitanya@gmail.com",1995,"Bangalore","India","Jp Park",550100);
insert into customer values(104,"Dhyanendra","K","dhyanendra.k@gmail.com",2001,"Bangalore","India","Marathahalli",550100);
insert into customer values(105,"Pawan","E","pawan.erra@gmail.com",2001,"Hyderabad","India","Ameerpet",500650);
update customer set address="DalalStreet" where custId=102;
insert into customer values(106,"Prithvi Kumar","J","prithvi.j@gmail.com",2008,"Chennai","India","Park Avenue",570650);
insert into customer values(107,"Vamshi ","G","vamshi.g@gmail.com",2006,"Mumbai","India","RIL",546000);
insert into customer values(108,"Tarun ","V","tarun.v@gmail.com",2012,"Mumbai","India","JP Group",546100);
insert into customer values(109,"Charan","Kumar","charan.kg@mail.com",2013,"Bangalore","India","PG",546060);
insert into customer values(110,"Bhanu Prasad","V","bhanu.prasad@gmail.com",2015,"Chennai","India","PTI",576070);
insert into customer values(111,"Shiva","R","shiva.r@gmail.com",2018,"Chennai","India","RTI OFFICE",576875);
insert into customer values(112,"Ravindra","Kumar","k.ravindra@gmail.com",2019,"Bangalore","India","Botanical Gardens",546875);
insert into customer values(113,"Naresh","R","naveen.r@gmail.com",2021,"Chennai","India","RTI OFFICE",556875);
insert into customer values(114,"Ashok","K","ashok.k@gmail.com",2022,"Bangalore","India","BG ROAD",546375);

select * from customer;

/* Enter the values for the bankaccount table */
insert into bankaccount values("SBI4510011025",25000,"SBI4510233","SBI_BankStreet","Savings",100);
insert into bankaccount values("SBI1022021245",10000,"SBI7896500","SBI_BankStreet","Current",100);
insert into bankaccount values("SBI4510099945",21000,"SBI4515560","SBI_BankStreet","Credit",100);

insert into bankaccount values("SBI7840125458",15000,"SBI4515680","SBI_Marathahalli","Current",101);
insert into bankaccount values("SBI7847841000",12000,"SBI4545820","SBI_Marathahalli","Savings",101);
insert into bankaccount values("SBI7896451020",14000,"SBI7895401","SBI_Marathahalli","Credit",101);

insert into bankaccount values("SBI7896445632",14000,"SBI7896300","SBI_DalalStreet","Savings",102);
insert into bankaccount values("SBI8742310000",12500,"SBI7996102","SBI_DalalStreet","Current",102);
insert into bankaccount values("SBI8742314510",10500,"SBI8745631","SBI_DalalStreet","Credit",102);


insert into bankaccount values("SBI7841055662",20000,"SBI4596120","SBI_JpPark","Credit",103);      
insert into bankaccount values("SBI7878961203",20500,"SBI4569780","SBI_JpPark","Savings",103);
insert into bankaccount values("SBI7841666741",20750,"SBI4596456","SBI_JpPark","Current",103);

insert into bankaccount values("SBI7841046663",20000,"SBI4596120","SBI_BGLR","Credit",104);                
insert into bankaccount values("SBI7841457810",11750,"SBI4596120","SBI_BGLR","Savings",104);
insert into bankaccount values("SBI5741089560",14750,"SBI4596120","SBI_BGLR","Current",104);

insert into bankaccount values("SBI5746677770",12750,"SBI5689741","SBI_HYD","Credit",105);
insert into bankaccount values("SBI5768888461",17750,"SBI5689741","SBI_HYD","Savings",105);
insert into bankaccount values("SBI5746667102",12750,"SBI5689741","SBI_HYD","Current",105);

insert into bankaccount values("SBI5100055530",12750,"SBI5696330","SBI_CHE","Current",106);      
insert into bankaccount values("SBI5100054430",12750,"SBI5696330","SBI_CHE","Credit",106);
insert into bankaccount values("SBI5100056630",12750,"SBI5696330","SBI_CHE","Savings",106);

insert into bankaccount values("SBI5999995123",12750,"SBI877890","SBI_MUB","Savings",107);
insert into bankaccount values("SBI5899991589",12750,"SBI877890","SBI_MUB","Current",107);
insert into bankaccount values("SBI5888842030",12750,"SBI877890","SBI_MUB","Credit",107);

insert into bankaccount values("SBI5111540345",16750,"SBI877883","SBI_MUB","Credit",108);
insert into bankaccount values("SBI5111579854",15800,"SBI877883","SBI_MUB","Credit",108);
insert into bankaccount values("SBI5111555590",19750,"SBI877883","SBI_MUB","Credit",108);

insert into bankaccount values("SBI4596123574",19750,"SBI899773","SBI_BNGLR","Credit",109);
insert into bankaccount values("SBI4596100089",19750,"SBI899773","SBI_BNGLR","Current",109);
insert into bankaccount values("SBI4596166663",19750,"SBI899773","SBI_BNGLR","Savings",109);

insert into bankaccount values("SBI4566661280",19750,"SBI899997","SBI_BNGLR","Credit",112);
insert into bankaccount values("SBI4566644620",22750,"SBI899997","SBI_BNGLR","Current",112);
insert into bankaccount values("SBI4566656789",23650,"SBI899997","SBI_BNGLR","Savings",112);


insert into bankaccount values("SBI1025697456",21650,"SBI810003","SBI_CHE","Savings",110);
insert into bankaccount values("SBI1025333456",24650,"SBI810003","SBI_CHE","CUrrent",110);
insert into bankaccount values("SBI1024777456",21650,"SBI810003","SBI_CHE","Credit",110);
 


insert into bankaccount values("SBI4566661423",23650,"SBI356697","SBI_CHE","Current",111);
insert into bankaccount values("SBI8974561256",26000,"SBI705597","SBI_CHE","Credit",111);


insert into bankaccount values("SBI4546656789",23650,"SBI899997","SBI_CHE","Savings",113);
insert into bankaccount values("SBI4101200789",23650,"SBI866667","SBI_CHE","Credit",113);
insert into bankaccount values("SBI4500000125",23650,"SBI835667","SBI_CHE","Current",113);

insert into bankaccount values("SBI9999451360",23650,"SBI777802","SBI_BNGLR","Current",114);
insert into bankaccount values("SBI9995555060",23650,"SBI832260","SBI_BNGLR","Credit",114);
insert into bankaccount values("SBI9888802060",23650,"SBI809967","SBI_BNGLR","Savings",114);




select *from bankaccount;

/* Enter the values in account statement */
insert into account_statement values("STMNT45612",10000,"YES","TRN_REF125630","ten thousand rupees is debited in your savings account","10-10-2022","SBI4510011025",100);
insert into account_statement values("STMNT45500",12000,"YES","TRN_REF125653","twelth thousand rupees is debited in your current account","10-10-2022","SBI1022021245",100);
insert into account_statement values("STMNT45410",15000,"YES","TRN_REF125455","fifteenth thousand rupees is debited in your credit account","10-10-2022","SBI4510099945",100);


insert into account_statement values("STMNT35510",15000,"YES","TRN_REF168900","fifteenth thousand rupees is debited in your curent account","17-10-2022","SBI7840125458",101);
insert into account_statement values("STMNT35511",15000,"YES","TRN_REF168910","fifteenth thousand rupees is debited in your Savings account","21-10-2022","SBI7847841000",101);
insert into account_statement values("STMNT35518",15000,"YES","TRN_REF168920","fifteenth thousand rupees is debited in your credit account","21-10-2022","SBI7896451020",101);

 
insert into account_statement values("STMNT65618",15000,"YES","TRN_REF168922","fifteenth thousand rupees is debited in your credit account","21-10-2022","SBI7896445632",102);
insert into account_statement values("STMNT10718",10000,"YES","TRN_REF168926","ten thousand rupees is debited in your credit account","26-11-2022","SBI8742310000",102);
insert into account_statement values("STMNT10118",20000,"YES","TRN_REF168929","twenty thousand rupees is debited in your credit account","23-10-2022","SBI8742314510",102);

       
insert into account_statement values("STMNT10119",20000,"YES","TRN_REF168932","twenty thousand rupees is debited in your credit account","23-06-2022","SBI7841055662",103);
insert into account_statement values("STMNT10120",21000,"YES","TRN_REF168930","twenty one thousand rupees is debited in your credit account","23-09-2022","SBI7841666741",103);
insert into account_statement values("STMNT10121",23000,"YES","TRN_REF168931","twenty three thousand rupees is debited in your credit account","28-08-2022","SBI7878961203",103);

       
 insert into account_statement values("STMNT10122",23000,"YES","TRN_REF168934","twenty three thousand rupees is debited in your credit account","28-08-2022","SBI7841046663",104);
 insert into account_statement values("STMNT10123",23000,"YES","TRN_REF168935","twenty three thousand rupees is debited in your credit account","28-08-2022","SBI7841457810",104);
 insert into account_statement values("STMNT10124",23000,"YES","TRN_REF168936","twenty three thousand rupees is debited in your credit account","28-08-2022","SBI5741089560",104);

           
insert into account_statement values("STMNT10125",23000,"YES","TRN_REF168937","twenty three thousand rupees is debited in your credit account","28-08-2022","SBI5100055530",105);
insert into account_statement values("STMNT10126",23000,"YES","TRN_REF168938","twenty three thousand rupees is debited in your credit account","28-08-2022","SBI5100054430",105);
insert into account_statement values("STMNT10127",23000,"YES","TRN_REF168939","twenty three thousand rupees is debited in your credit account","28-08-2022","SBI5100056630",105);

insert into account_statement values("STMNT10128",23000,"YES","TRN_REF168940","twenty three thousand rupees is debited in your credit account","28-08-2022","SBI5999995123",107);
insert into account_statement values("STMNT10129",20000,"YES","TRN_REF168941","twenty thousand rupees is debited in your credit account","21-05-2022","SBI5899991589",107);
insert into account_statement values("STMNT10130",22000,"YES","TRN_REF168942","twenty two thousand rupees is debited in your credit account","28-04-2022","SBI5888842030",107);
insert into account_statement values("STMNT10131",24000,"YES","TRN_REF168943","twenty four thousand rupees is debited in your credit account","24-06-2022","SBI5111540345",108);
insert into account_statement values("STMNT10132",10000,"YES","TRN_REF168944","ten thousand rupees is debited in your credit account","23-03-2022","SBI5111579854",108);
insert into account_statement values("STMNT10133",20000,"YES","TRN_REF168945","twenty  thousand rupees is debited in your credit account","22-02-2022","SBI5111555590",108);

               
insert into account_statement values("STMNT10134",15000,"YES","TRN_REF168946","fifeteen  thousand rupees is debited in your credit account","22-02-2022","SBI4596123574",109);
insert into account_statement values("STMNT10135",20000,"YES","TRN_REF168947","twenty  thousand rupees is debited in your credit account","20-03-2022","SBI4596100089",109);
insert into account_statement values("STMNT10136",13000,"YES","TRN_REF168948","thirteen  thousand rupees is debited in your credit account","21-05-2022","SBI4596166663",109);
insert into account_statement values("STMNT10137",12000,"YES","TRN_REF168949","twelve  thousand rupees is debited in your credit account","26-04-2022","SBI4566661280",112);
insert into account_statement values("STMNT10138",17000,"YES","TRN_REF168950","seventeen  thousand rupees is debited in your credit account","27-02-2022","SBI4566644620",112);

insert into account_statement values("STMNT10140",9000,"YES","TRN_REF168952"," nine  thousand rupees is debited in your credit account","22-08-2022","SBI1025697456",110);
insert into account_statement values("STMNT10141",7500,"YES","TRN_REF168953"," seven thousand five hundred rupees is debited in your credit account","21-02-2022","SBI1025333456",110);
insert into account_statement values("STMNT10142",16000,"YES","TRN_REF168954","sixteen  thousand rupees is debited in your credit account","22-09-2022","SBI1024777456",110);


insert into account_statement values("STMNT16248",16050,"YES","TRN_REF167960","sixteen  thousand fifty rupees is debited in your credit account","22-09-2022","SBI4500000125",113);
insert into account_statement values("STMNT15249",16100,"YES","TRN_REF167961","sixteen  thousand one hundred rupees is debited in your credit account","22-09-2022","SBI9999451360",114);
insert into account_statement values("STMNT13250",15700,"YES","TRN_REF167962","sixteen  thousand sevem hundred rupees is debited in your credit account","22-09-2022","SBI9995555060",114);
insert into account_statement values("STMNT15351",16500,"YES","TRN_REF166963","sixteen  thousand five hundred rupees is debited in your credit account","22-09-2022","SBI9888802060",114);



insert into account_statement values("STMNT10000",40500,"YES","TRN_REF1568910","fourty thousand five hundred rupees is debited in your credit account","27-09-2022","SBI1024777456",110);

select *from account_statement;

/* Select customers whose city is Chennai,Bangalore,Mumbai   */
select *from customer ;
select *from customer where city in ('Chennai','Mumbai','Bangalore');
select count(*) from customer where city in ('Chennai','Mumbai','Bangalore');


/* Select customers based on dob between 2000 and 2022*/
select *from customer where  dob between 2000 and 2022;

select bankaccount.custId,bankaccount.accountNbr,bankaccount.account_type,account_statement.AccStmId,account_statement.amount,account_statement.transactionRefNumber,
       account_statement.txn_date,account_statement.description
from bankaccount left join account_statement on bankaccount.accountNbr = account_statement.accountNbr
order by bankaccount.custId;

select customer.custId,account_statement.accountNbr,account_statement.AccStmId,
account_statement.amount,account_statement.transactionRefNumber,account_statement.txn_date,
account_statement.description  
from customer right join account_statement on customer.custId=account_statement.custId;

select customer.custId,accountNbr,account_statement.AccStmId,customer.dob,
account_statement.amount,account_statement.transactionRefNumber,account_statement.txn_date,
account_statement.description from customer
right join account_statement on customer.custId=account_statement.custId where customer.dob>=2000 && customer.dob<=2022;

select  customer.custId,customer.first_name,customer.dob,bankaccount.accountNbr,bankaccount.balance,
 bankaccount.bank_code,bankaccount.branch_code,bankaccount.account_type
from  customer right join bankaccount on customer.custId = bankaccount.custId where customer.dob between 2000 and 2022;

select  customer.custId,customer.first_name,customer.dob,bankaccount.accountNbr,bankaccount.balance,
 bankaccount.bank_code,bankaccount.branch_code,bankaccount.account_type,customer.city
from  customer right join bankaccount on customer.custId = bankaccount.custId where city in ('Mumbai','Chennai','Bangalore');

select bankaccount.accountNbr,bankaccount.account_type,account_statement.AccStmId,
         sum(account_statement.amount) from bankaccount
right join account_statement on bankaccount.accountNbr = account_statement.accountNbr   where bankaccount.account_type = "Credit"
group by account_statement.accountNbr;