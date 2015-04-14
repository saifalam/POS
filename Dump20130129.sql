CREATE DATABASE  IF NOT EXISTS `bata` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bata`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: bata
-- ------------------------------------------------------
-- Server version	5.5.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(45) NOT NULL,
  `designation` varchar(45) NOT NULL,
  `emp_address` varchar(45) NOT NULL,
  `emp_contact` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'kaiser Alam','manager','dhaka','01673617095','alam.kaiser20@gmail.com'),(2,'saif','cashier','dinajpur','0987654321','aust.saif@gmail.com'),(3,'teon','salesman','kushtia','2143658709',NULL),(4,'tawseef','salesman','dhaka','0989787656',NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory` (
  `i_id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity` int(11) NOT NULL,
  `p_id` varchar(45) NOT NULL,
  PRIMARY KEY (`i_id`),
  KEY `for_inv` (`p_id`),
  CONSTRAINT `for_inv` FOREIGN KEY (`p_id`) REFERENCES `product` (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (7,42,'p118'),(8,38,'p120'),(9,30,'p122'),(10,50,'p218'),(11,40,'p220'),(12,30,'p222'),(13,50,'p318'),(14,40,'p320'),(15,30,'p322'),(16,50,'p418'),(17,40,'p420'),(18,30,'p422'),(19,50,'p518'),(20,40,'p520'),(21,30,'p522'),(22,50,'p618'),(23,40,'p620'),(24,30,'p622'),(25,50,'p718'),(26,40,'p720'),(27,30,'p722'),(28,50,'p818'),(29,40,'p820'),(30,30,'p822'),(31,50,'p918'),(32,40,'p920'),(33,30,'p922'),(34,50,'p1018'),(35,40,'p1020'),(36,30,'p1022'),(37,50,'p1118'),(38,40,'p1120'),(39,30,'p1122'),(40,50,'p1218'),(41,40,'p1220'),(42,30,'p1222');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `o_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_id` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `o_date` date NOT NULL,
  `s_id` int(11) NOT NULL,
  `d_date` date NOT NULL,
  PRIMARY KEY (`o_id`),
  KEY `fr_ord1` (`p_id`),
  KEY `fr_ord2` (`s_id`),
  CONSTRAINT `fr_ord1` FOREIGN KEY (`p_id`) REFERENCES `product` (`p_id`),
  CONSTRAINT `fr_ord2` FOREIGN KEY (`s_id`) REFERENCES `supplier` (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `p_id` varchar(45) NOT NULL,
  `p_name` varchar(45) NOT NULL,
  `p_cat` varchar(45) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`p_id`),
  UNIQUE KEY `p_idt_UNIQUE` (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('p1018','Boys','KIDS',1000),('p1020','Boys','KIDS',1000),('p1022','Boys','KIDS',1000),('p1118','Girls','KIDS',600),('p1120','Girls','KIDS',600),('p1122','Girls','KIDS',600),('p118','Industrial','MEN',2250),('p120','industrial','MEN',2250),('p1218','Canvas','KIDS',1600),('p122','industrial','MEN',2250),('p1220','Canvas','KIDS',1600),('p1222','Canvas','KIDS',1600),('p218','Dress','MEN',2050),('p220','Dress','MEN',2050),('p222','Dress','MEN',2050),('p318','Casual','MEN',1650),('p320','Casual','MEN',1650),('p322','Casual','MEN',1650),('p418','Canvas','MEN',850),('p420','Canvas','MEN',850),('p422','Canvas','MEN',850),('p518','Dress Flat','LADIES',800),('p520','Dress Flat','LADIES',800),('p522','Dress Flat','LADIES',800),('p618','Dress heel','LADIES',1000),('p620','Dress heel','LADIES',1000),('p622','Dress heel','LADIES',1000),('p718','Casual','LADIES',1400),('p720','Casual','LADIES',1400),('p722','Casual','LADIES',1400),('p818','Canvas','LADIES',2000),('p820','Canvas','LADIES',2000),('p822','Canvas','LADIES',2000),('p918','Infant','KIDS',1800),('p920','Infant','KIDS',1800),('p922','Infant','KIDS',1800);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesman`
--

DROP TABLE IF EXISTS `salesman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salesman` (
  `sal_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) NOT NULL,
  `target` double NOT NULL,
  `achieve` double NOT NULL,
  PRIMARY KEY (`sal_id`),
  KEY `fr_sal` (`emp_id`),
  CONSTRAINT `fr_sal` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesman`
--

LOCK TABLES `salesman` WRITE;
/*!40000 ALTER TABLE `salesman` DISABLE KEYS */;
INSERT INTO `salesman` VALUES (2,3,5000,8550),(3,4,8000,0);
/*!40000 ALTER TABLE `salesman` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(45) NOT NULL,
  `s_contact` varchar(45) NOT NULL,
  `s_email` varchar(45) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'Shanto','01675745248','asad.aust.063@gmail.com');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `t_id` varchar(45) NOT NULL,
  `P_id` varchar(45) NOT NULL,
  `p_name` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` double NOT NULL,
  `sell_date` datetime NOT NULL,
  `emp_id` int(11) NOT NULL,
  `discount` varchar(45) NOT NULL,
  PRIMARY KEY (`t_id`,`P_id`,`sell_date`),
  KEY `fr_tran` (`emp_id`),
  CONSTRAINT `fr_tran` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES ('t1','p118','shoe',1,2200,'2013-01-24 01:01:00',3,'0'),('t2','p118','Industrial',1,2250,'2013-01-27 08:45:30',3,'0'),('t3','p118','Industrial',1,2250,'2013-01-27 08:46:53',3,'0'),('t4','p120','industrial',2,4050,'2013-01-27 10:29:53',3,'10');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `u_id` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`u_id`),
  KEY `emp_id` (`emp_id`),
  CONSTRAINT `emp_id` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('u-100','1234',1),('u-200','4321',2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-01-29 12:12:45
