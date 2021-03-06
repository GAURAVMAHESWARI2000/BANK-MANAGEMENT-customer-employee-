-- MySQL dump 10.13  Distrib 8.0.19, for Linux (x86_64)
--
-- Host: localhost    Database: bank
-- ------------------------------------------------------
-- Server version	8.0.19-0ubuntu0.19.10.3

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `PAGE1`
--

DROP TABLE IF EXISTS `PAGE1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PAGE1` (
  `CUSTOMERID` varchar(12) DEFAULT NULL,
  `PASSWORD` varchar(15) DEFAULT NULL,
  `NAME` varchar(20) DEFAULT NULL,
  `SURNAME` varchar(20) DEFAULT NULL,
  `FATHERNAME` varchar(20) DEFAULT NULL,
  `DOB` varchar(20) DEFAULT NULL,
  `GENDER` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `ADDRESS` varchar(100) DEFAULT NULL,
  `CITY` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PAGE1`
--

LOCK TABLES `PAGE1` WRITE;
/*!40000 ALTER TABLE `PAGE1` DISABLE KEYS */;
INSERT INTO `PAGE1` VALUES ('568924','gaurav123','GAURAV','MAHESHWARI','MAHANAND','31-03-2000','male','GAURAVJIMAHESHWARI@GMAIL.COM','ISANPUR','AHMEDABAD'),('569918','karmakar','GOURAB','KARMAKAR','GOUTAM','01012000','MALE','gourabkarmakar297@gmail.com','HOWRAH','KOLKATA'),('415358','123456789surya','surya','sen','fhudygtfjy','18/07/2000','male','surya@gmail.com','gdyugtw3rghhkoiuuyr','yrtyryte5'),('979611','6565393','narendra','modi','damodar','25-07-1968','male','narendradamodar@gmail.com','gaon','vadodara');
/*!40000 ALTER TABLE `PAGE1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PAGE2`
--

DROP TABLE IF EXISTS `PAGE2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PAGE2` (
  `CUSTOMERID` varchar(10) DEFAULT NULL,
  `RELIGION` varchar(15) DEFAULT NULL,
  `CATEGORY` varchar(30) DEFAULT NULL,
  `INCOME` varchar(20) DEFAULT NULL,
  `EDUCATION` varchar(20) DEFAULT NULL,
  `OCCUPATION` varchar(40) DEFAULT NULL,
  `PAN_NUMBER` varchar(14) DEFAULT NULL,
  `AADHAAR_NUMBER` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PAGE2`
--

LOCK TABLES `PAGE2` WRITE;
/*!40000 ALTER TABLE `PAGE2` DISABLE KEYS */;
INSERT INTO `PAGE2` VALUES ('568924','HINDU','GENERAL','NIL','PURSUING BTECH','STUDENT','12345','23838713'),('569918','HINDU','GEN','7890','12TH','BUSINESS','459015','09876543213'),('415358','indivhf','yjgy','4579964','fghfgukgtddf','fyiuyut','ytrty5tfhfyjg','354458789090'),('979611','bigot hindu','OBC','23454532','none','P.M.','********','7777*****6789**');
/*!40000 ALTER TABLE `PAGE2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PAGE3`
--

DROP TABLE IF EXISTS `PAGE3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PAGE3` (
  `CUSTOMERID` int DEFAULT NULL,
  `BALANCE` int DEFAULT NULL,
  `LAST_TRANSACTION` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PAGE3`
--

LOCK TABLES `PAGE3` WRITE;
/*!40000 ALTER TABLE `PAGE3` DISABLE KEYS */;
INSERT INTO `PAGE3` VALUES (568924,1200,-90),(569918,140,-2200),(415358,5400,-400),(979611,0,0);
/*!40000 ALTER TABLE `PAGE3` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-13 12:09:58
