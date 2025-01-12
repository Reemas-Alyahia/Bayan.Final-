
<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="">
<img src="images/tuwaiq.png" alt="logo" width="152" height="100">
<img src="images/bayan.png" alt="logo" width="152" height="100">
 
</a>
 
<h3 align="center">Bayan</h3>

  <p align="center">
  This final project wraps up the Java Spring Boot Web Application Development bootcamp at Tuwaiq Academy.
 <br />
    <a href="https://github.com/salemALmotiry/Bayan"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://www.figma.com/design/zTIO7kQz6k6514lARuOtXo/Untitled1?node-id=0-1&p=f&t=1OL4NiM8cWGly5It-0">Figma</a>
    ·
    <a href="https://documenter.getpostman.com/view/40740226/2sAYJAcwpL">Postman API</a>
    ·
    <a href="https://github.com/salemALmotiry/Bayan/issues">Request Feature</a>
  </p>


<!-- TABLE OF CONTENTS -->
## Table of Contents


* [About the Project](#about-the-project)
  * [Built With](#built-with)
  * [Live Version](#live-version)
  * [Usage](#usage)
* [Key Features](#key-features)
* [Diagram](#Diagram)
* [User Cases](#user-cases)
* [Models](#models)
* [JUnit](#Testing-Frameworks)
* [Extra Endpoints](#extra-endpoints)
  * [DTO Files](#dto-files)
* [License](#license)

<!-- ABOUT THE PROJECT -->
## About The Project
Bayan is a specialized platform designed to streamline customs clearance processes by connecting clients, 
whether individuals or companies, with certified customs brokers. 
Bayan offers an advanced shipment management system,
supported by innovative tools that help reduce time and effort while simplifying customs procedures.

بيان هي منصة متخصصة تهدف إلى تسهيل عمليات التخليص الجمركي من خلال ربط العملاء، سواء كانوا أفرادًا أو شركات، بمخلصين جمركيين معتمدين. تقدم بيان نظامًا متطورًا لإدارة الشحنات، مدعومًا بأدوات مبتكرة تُسهم في تقليل الوقت والجهد وتبسيط الإجراءات الجمركية.



<!-- ABOUT THE PROJECT -->
## 🛠 Key Features

### **Customer and Broker Reviews**
Facilitate mutual feedback with ratings and reviews to enhance collaboration.

---

### **Order Management**
Simplify order processing, track shipments, and manage delivery statuses effortlessly.

---

### **Shipment Tracking**
Track shipments with precision using various supported providers:

#### Small and Medium Shipments (Air and Land Logistics):
- **Aramex**
- **Naqel**
- **DHL**

#### Large Shipments (Air and Sea Logistics):
- **Saudi Cargo** (Air – specializes in large shipments)
- **MSC** (Sea – handles large cargo)

---

### **Offer and Request Handling**
Seamlessly create requests, receive offers, and manage collaboration with customs brokers.

---

### **File Management System**
Upload, organize, and download shipment-related documents with ease.

---

### **Notifications and Alerts**
Stay informed with instant updates through email and SMS notifications.


## Diagram
![img.png](img.png)
<!-- LIVE VERSION -->

## User cases
![image](https://github.com/user-attachments/assets/44bb88da-2b41-4cf2-82bd-64e8a707ab90)
![image](https://github.com/user-attachments/assets/50c32047-16e0-4025-84fb-0b57b66e7916)
![image](https://github.com/user-attachments/assets/3ae585af-cfe2-4b43-a2aa-85fa439262da)
![image](https://github.com/user-attachments/assets/8eed383e-5e78-4a1d-9e8d-17e3fdf6f797)
<!-- Contributing -->

---
## Models
| **Model Name**   |
|------------------|
| Border       |
| ChatMessages |
| Customer     |
| Contract     |
|  Review      |


## Extra endpoint

| **HTTP Method** | **Relative Path**                                    | **Cotnroller*                |
|-----------------|------------------------------------------------------|-----------------------------------|
| POST            | `/create-subscription-post"`                         | `subscription-post`               |
| GET             | `/get-all-subscription-posts`                        | `subscription-post`               |
| PUT             | `/create-subscription-post-for-broker/{brokerId}`    |`subscription-post`                |
| GET             | `/posts-for-broker"`                                 | `subscription-post`               |
| GET             | `/my-posts`                                          | `Post`                            |
| GET             | `/posts-for-broker             `                     | `subscription-post`               |
| GET             | `Get Customer's Subscription Posts`                  | `subscription-post`               |
| POST            | `/create-sub-offer`                                  | `Offer`                           |
| PUT             | `/accept-offer-for-subscription-post/{offerId}`      | `Offer`                           |
| Get             | `/offer-statistics`                                  | `Offer`                           |
| GET             | `general-post-statistics`                            | `Post`                            |
| GET             | `by-category-shipment-type-country`                  | `Post`                            |
| GET             | `by-category-and-country`                            | `Post`                            |
| GET             | ` Get all posts by shipment type`                    | `Post`                            |
| GET             | `Get all posts by country of origin`                 | `Post`                            |
| GET             | `Get all posts by category`                          | `Post`                            |
| GET             | `Get all posts by border name`                       |`Post`                             |
| GET             | `getCustomerWithRental`                              | `Contract`                        |
| GET             | `getbroker-rentals`                                  | `Contract`                        |
| GET             | `broker-with-rentals`                                | `Contract`                        |
| PUT             | `read-my-notifications/mark-as-read`                 | `Notfication`                     |
| POST            | `/register`                                          | `Customer `                       |
| GET             | `get Offer Statistics For Broker `                   | ` CustomBroker `                  |
| GET             | `get Review Statistics For Broker`                   | ` CustomBroker `                  |


##Use Email for notifications

---

### DTO Files

| **Folder**   | **Type**           | **Name**               |
|--------------|--------------------|---------------------|
| IN           |CustomsBroker       | CustomsBrokerDTO    |
| IN           | Delivery           | DeliveryDTO         |
| IN           | RequiredDocument   | RequiredDocumentDTO |
| IN           | ReviewBroker       | ReviewBrokerDTO     |
| OUT          | Post               | CbmResponseDTO      |
| OUT          | ChatMessages       | ChatMessagesDTO     |
| OUT          | Cotract            | ContractDTO         |
| OUT          | CustomBroker       | CustomBrokerDTO     |
| OUT          |CustomBroker        |CustomBrokerFilterDTO|
| OUT          | CustomBroker       | CustomBrokerForAdminDTO  |



## Testing Frameworks  
- **JUnit** –  Used for testing, Service layer validation.  

## Live version

You can see it working [here](https://replit.com/@salmotiry/Bayan)



### Built With
This project was built using:

- **Java SE**
- **IntelliJ IDEA**
- **MySQL**
- **Spring Boot**
- **AWS**
- **Ultramsg**
- **Spring Boot Mail Integration**
- **Postman**
- **Git**
- **DataGrip**
- **Selenium**
- **ChromeDriver**


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/salemALmotiry/Bayan.svg?style=flat-square
[contributors-url]:https://github.com/salemALmotiry/Bayan/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/salemALmotiry/Bayan.svg?style=flat-square
[forks-url]: https://github.com/salemALmotiry/Bayan/network/members
[stars-shield]: https://img.shields.io/github/stars/salemALmotiry/Bayan.svg?style=flat-square
[stars-url]: https://github.com/salemALmotiry/Bayan/stargazers
[issues-shield]: https://img.shields.io/github/issues/salemALmotiry/Bayan.svg?style=flat-square
[issues-url]: https://github.com/salemALmotiry/Bayan/graphs/contributors
[product-screenshot]: images/tic-tac-toe.png

<!-- License -->

## 📝 License

This project is [MIT](https://opensource.org/licenses/MIT) licensed.
