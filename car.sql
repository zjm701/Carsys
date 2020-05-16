SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `carMessage`
-- ----------------------------
DROP TABLE IF EXISTS `carMessage`;
CREATE TABLE `carMessage` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `carName` varchar(100) NOT NULL,
  `carType` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL,
  `carSeries` varchar(100) NOT NULL,
  `amount` int(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carmessage
-- ----------------------------
INSERT INTO `carMessage` VALUES ('1', 'Buick', '中型车', '28.5-70.0万', 'A级', 100);
INSERT INTO `carMessage` VALUES ('2', 'Chevrolet', '中型车', '28.5-70.0万', 'A级', 200);
INSERT INTO `carMessage` VALUES ('3', 'Cadillac', '中型车', '28.5-100.0万', '高级', 500);
INSERT INTO `carMessage` VALUES ('4', 'Bmw', 'SUV', '30.8-56.3万', 'X1', 400);
INSERT INTO `carMessage` VALUES ('5', 'Benz', '中型车', '28.5-70.0万', 'C级', 300);
INSERT INTO `carMessage` VALUES ('6', 'Bentley', '轿车', '128.5-170.0万', '高级', 10);
INSERT INTO `carMessage` VALUES ('7', 'Lamborghini', '轿车', '128.5-170.0万', '高级', 10);
INSERT INTO `carMessage` VALUES ('8', 'RangeRover', '轿车', '128.5-170.0万', '高级', 10);
INSERT INTO `carMessage` VALUES ('9', 'Volkswagen', '轿车', '128.5-170.0万', '高级', 10);
INSERT INTO `carMessage` VALUES ('10', 'Rolls', '轿车', '128.5-170.0万', '高级', 10);
INSERT INTO `carMessage` VALUES ('11', 'Kia', '轿车', '128.5-170.0万', 'A级', 10);
INSERT INTO `carMessage` VALUES ('12', 'Alpina', '轿车', '128.5-170.0万', '高级', 10);
INSERT INTO `carMessage` VALUES ('13', 'Porsche', '中型车', '128.5-170.0万', '高级', 10);
INSERT INTO `carMessage` VALUES ('14', 'Honda', '轿车', '128.5-170.0万', 'A级', 10);
INSERT INTO `carMessage` VALUES ('15', 'Peugeot', '轿车', '128.5-170.0万', '高级', 10);
INSERT INTO `carMessage` VALUES ('16', 'Ferrari', '轿车', '128.5-170.0万', '高级', 10);
