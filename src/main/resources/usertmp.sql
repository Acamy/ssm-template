-- ----------------------------
-- Table structure for usertmp
-- ----------------------------
DROP TABLE IF EXISTS `usertmp`;
CREATE TABLE `usertmp` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_pass` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usertmp
-- ----------------------------
INSERT INTO `usertmp` VALUES ('1', 'userName', '123456', '123456@qq.com');
