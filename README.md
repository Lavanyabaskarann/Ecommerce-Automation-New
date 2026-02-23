# 🚀 E-Commerce API Automation Framework

[![Java](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![Rest-Assured](https://img.shields.io/badge/Library-Rest--Assured-green.svg)](https://rest-assured.io/)
[![TestNG](https://img.shields.io/badge/Framework-TestNG-blue.svg)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Build-Maven-red.svg)](https://maven.apache.org/)

A professional **Hybrid Data-Driven Framework** designed to automate the PetStore / E-commerce API. This project demonstrates advanced automation concepts like POJO modeling, multi-module testing, and externalized data management.

---

## 🏗 Framework Architecture
This project follows the **Page Object Model (POM)** philosophy for API testing by separating concerns into distinct layers:

* **Models (POJO):** Java objects representing API request/response payloads (e.g., `User.java`, `Pet.java`).
* **Endpoints:** Dedicated classes (`UserServices.java`) to handle HTTP methods (GET, POST, PUT, DELETE) using Rest-Assured.
* **Utilities:** Robust helpers for Excel interaction (`XLUtility.java`) and Extent Reporting.
* **Data-Driven:** Leverages TestNG `@DataProvider` to inject data from Excel sheets directly into test methods.



---

## 🛠 Features Implemented
- [x] **Full CRUD Lifecycle:** Automates Create, Read, Update, and Delete operations.
- [x] **Negative Testing:** Validates system resilience by asserting `404 Not Found` for invalid resources.
- [x] **External Configuration:** Uses `config.properties` for easy environment switching (QA/Dev/Prod).
- [x] **Excel Integration:** Drives 10+ test cases via a single Excel spreadsheet.
- [x] **Rich Reporting:** Generates interactive HTML dashboards with pie charts and step-by-step logs.

---

## 📁 Folder Structure
```text
.
├── src/test/java
│   ├── api.endpoints      # API Methods & Route definitions
│   ├── api.models         # Request Payloads (POJOs)
│   ├── api.tests          # Test Suites (User & Pet modules)
│   └── api.utilities      # Excel Helpers & Listeners
├── src/test/resources
│   ├── config.properties  # Global variables
│   └── Userdata.xlsx      # Test Data Source
├── reports                # Auto-generated HTML Reports
├── pom.xml                # Project Dependencies
└── testng.xml             # Test Execution Suite
