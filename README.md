# StockRestApp

REST APIs for CRUD operations

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Install JDK 1.8 

### Installing

set PATH="C:\Program Files\Java\jdk1.8.0_144\bin";%PATH%
set JAVA_HOME="C:\Program Files\Java\jdk1.8.0_144\bin"

### Install Git

1. Download the latest version of 64-bit [Git](https://git-scm.com/download/win)
1. Run the installer.
1. Check installation: 
```
C:\> git --version
git version 2.14.2.windows.3

### Install the project

Clone Project from Github.

### Install Maven

Install [latest Maven](https://maven.apache.org/download.cgi).  After the installation is complete, set up an environment variable called M2_HOME that points to your Maven installation directory.

#### Add the bin directory under M2_HOME to the PATH.

Open **cmd** then run the commands below to update your installation path.

```
set PATH="<Your maven installation path>\bin";%PATH%
set M2_HOME="<Your maven installation path>" 
```
Run `mvn --version` to verify that it is correctly installed.

### Install Eclipse

### Check-out code from github
 
## Running the Project

Import the project to your workspace.

Swagger is configured with this project to test the Application.

Link for swagger in case running the application in Local system : 

```
http://localhost:8080/swagger-ui.html

```

Click on `Expand Operations` link to see test the APIs.

Provided the input for Update operation to test this application.

```
{
    "id": 1,
    "name": "Dhirendra",
    "currentPrice": 15000,
    "lastUpdate": "2018-03-10T21:33:39.907+0000"
  }
  
  ```
  
  Provided the input for Create operation to test this application.
  
  ```
{
    "name": "Dhirendra",
    "currentPrice": 15000,
    "lastUpdate": "2018-03-10T21:33:39.907+0000"
  }
  
  ```

Naming convention of REST APIs are the programming excercise document.

Assume that you are running this application locally.

Get List of Stocks: `http://localhost:8080/api/stocks`
Get one Stock from List : `http://localhost:8080/api/stocks/1`
Update one Stock: `http://localhost:8080/api/stocks/1`
Create a Stock: `http://localhost:8080/api/stocks`

On Application startup some dummy data is getting loaded through the StockLoader class.
 

### And coding style tests

FindBug, CheckStyle and PMD has been used to validate coding standard.

## Built With

* SpringBoot is used to build this peoject
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Dhirendra Sahoo** - *Initial work* - [StockRestApp](https://github.com/SahooDhirendra/StockRestApp.git)

