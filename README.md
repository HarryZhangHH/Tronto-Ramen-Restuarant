Tronto Ramen Restuarant
=====================================================

### Development Enviroment
- Java jdk==1.8

- Junit5

### Program Description
Our software contains self-service kiosk system and Administrator’s management system, and it is a standard-alone application without database. 


### Get Started
1. Using cmd
    
    - Put Software_group63.jar into eclipse-workspace. (It should be in the same-level directory with bin,data,src folders)
  
    - Using the cmd, first using cd command and enter the path obtained above, the program will successfully run.

    -  Then enter follwing statment in command line to configure the software. 

            **java -jar Software_group63.jar**
       
     ** Notice that the jar file should be put into right project in the workspace. *

    ** Notice that the home page shown above is unnecessary in the real life since the self-service system and management system are separate in the real life. We add the GUI only for the convenience of demonstrating. *

2. Using IDE (Eclipse/MyEclipse/IDEA)
 
    - You can also import the jar file. 

    - Or you can create a new project and put folder in to the new project. Right click the src folder choose “Build bath” then choose use as a source folder. Click GuiHome.java and click run, the software will run.


###Developers
                Haohui Zhang

   
    
###Instructions
 The button named “Management System” is for staff and the button named “Self -service Kiosk” is for customers.

- **Self-service Kiosk System**

    ①　Customer click “SUBMIT” to submit his or her favourite dish. (At persent we only have ramen for customers to order but we will launch new dishes in the near future.)

    ②　After choosing ramen, in this page, customers can select the flavor of soup, the mouth feel of noodles and the quantity of spring-onion.

    ③　Customers can personize their dishes with "weather they need Nori, Chashu or egg","their favourite spiciness","extra ingredient" ,"taking away or eating in". 

    ④　When customers have finish their order, they can click “LOGIN” to input account number and password to login. Non-members can enroll to be a loyal member or pay the bill directly by card, credit card or cash.

    ⑤　Customers' vip information will be showed after login successfully. Vip members can trade 10 stamps for one free Ramen. 
    
    *Note: If you click on ”View Status every week” button, you will be sent a weekly report to you.*

    ⑥　People can check their orders.
    
    
- **Management System**
    
    ①　Administrators can check their orders gotten in last week at this page.
    
    ②　Staff can check the restaurant VIP information after click vip management.
    
    ③　Staffs can do some management of menu in this page.

    *Note: If click on "Reset Menu”, the menu will be reset to its initial state.*

    ④　When an item is ticked, it means its materials are used up and won’t be chosen by customers.

    ⑤　After clicking “Modify menu”, staff can modify the price of Ramen and other side dishes.

    ⑥　This page shows staff the statistic data last week of all items customers have chosen. 
Note: If administrator clicks on “Generate Report” button, a report will be generated and can be seen in the folder (named staticReport.txt).