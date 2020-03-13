/*
Navicat MySQL Data Transfer

Source Server         : 10085
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2020-03-13 10:12:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` varchar(15) DEFAULT NULL COMMENT '角色权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', 'admin');
INSERT INTO `user` VALUES ('2', 'user', 'user', 'user');
INSERT INTO `user` VALUES ('3', '1', '1', 'admin');
INSERT INTO `user` VALUES ('4', '2', '2', 'admin');
INSERT INTO `user` VALUES ('22', '3', '3', 'user');
INSERT INTO `user` VALUES ('25', '4', '4', 'user');
