/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : cloud_video

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2019-04-24 21:16:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for vwt_cloud_meet
-- ----------------------------
DROP TABLE IF EXISTS `vwt_cloud_meet`;
CREATE TABLE `vwt_cloud_meet` (
  `id` varchar(255) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `creator_id` varchar(255) DEFAULT NULL,
  `is_msg` varchar(255) DEFAULT NULL,
  `meet_type` varchar(255) DEFAULT NULL,
  `order_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vwt_cloud_meet
-- ----------------------------
INSERT INTO `vwt_cloud_meet` VALUES ('aaa', '2019-04-15 13:49:38', '111', '0', '0', '2019-04-24 18:53:10');

-- ----------------------------
-- Table structure for vwt_cloud_member
-- ----------------------------
DROP TABLE IF EXISTS `vwt_cloud_member`;
CREATE TABLE `vwt_cloud_member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `meet_id` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKftiyjhosnf0uy5gvuhfetnu8e` (`meet_id`),
  CONSTRAINT `FKftiyjhosnf0uy5gvuhfetnu8e` FOREIGN KEY (`meet_id`) REFERENCES `vwt_cloud_meet` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vwt_cloud_member
-- ----------------------------
INSERT INTO `vwt_cloud_member` VALUES ('1', 'aaa', '1', '111');
INSERT INTO `vwt_cloud_member` VALUES ('2', 'aaa', '2', '222');
INSERT INTO `vwt_cloud_member` VALUES ('3', 'aaa', '2', '555');

-- ----------------------------
-- Table structure for vwt_cloud_power
-- ----------------------------
DROP TABLE IF EXISTS `vwt_cloud_power`;
CREATE TABLE `vwt_cloud_power` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `corp_id` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `virtaul_user_id` varchar(255) DEFAULT NULL,
  `virtual_mobile` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vwt_cloud_power
-- ----------------------------
INSERT INTO `vwt_cloud_power` VALUES ('1', 'aaa', '18752334491', '111', 'yucong-1', null, null);
INSERT INTO `vwt_cloud_power` VALUES ('2', 'aaa', '18752334492', '222', 'yucong-2', null, null);
INSERT INTO `vwt_cloud_power` VALUES ('3', 'aaa', '18752334493', '333', 'yucong-3', null, null);
INSERT INTO `vwt_cloud_power` VALUES ('4', 'aaa', '18752334494', '444', 'yucong-4', null, null);
INSERT INTO `vwt_cloud_power` VALUES ('5', 'aaa', '18752334495', '555', 'yucong-5', null, null);
