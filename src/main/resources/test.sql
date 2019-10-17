/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 17/10/2019 10:34:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_id_card
-- ----------------------------
DROP TABLE IF EXISTS `tb_id_card`;
CREATE TABLE `tb_id_card`  (
  `id_card_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '身份证的id ,不是 身份证号',
  `id_card_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  PRIMARY KEY (`id_card_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_id_card
-- ----------------------------
INSERT INTO `tb_id_card` VALUES (1, '78966999805302345');
INSERT INTO `tb_id_card` VALUES (2, '786968199710242345');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `id_card_ref` int(11) UNSIGNED NOT NULL COMMENT '一个人只有一个身份证号，引用 tb_id_card 的 id',
  `phone_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '一个人有多个电话号码',
  PRIMARY KEY (`user_id`) USING BTREE,
  INDEX `id_card_ref`(`id_card_ref`) USING BTREE,
  CONSTRAINT `tb_user_ibfk_1` FOREIGN KEY (`id_card_ref`) REFERENCES `tb_id_card` (`id_card_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, '诸葛亮', 1, '13001001314');
INSERT INTO `tb_user` VALUES (2, '刘备', 2, '13639516321');

SET FOREIGN_KEY_CHECKS = 1;
