package com.asiainfo.mybatis_demo.entity;

import lombok.Data;

/**
 CREATE TABLE `tb_user`  (
 `user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
 `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
 `id_card_ref` int(11) UNSIGNED NOT NULL COMMENT '一个人只有一个身份证号，引用 tb_id_card 的 id',
 `phone_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '一个人有多个电话号码',
 PRIMARY KEY (`user_id`) USING BTREE,
 INDEX `id_card_ref`(`id_card_ref`) USING BTREE,
 CONSTRAINT `tb_user_ibfk_1` FOREIGN KEY (`id_card_ref`) REFERENCES `tb_id_card` (`id_card_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
 ) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

 SET FOREIGN_KEY_CHECKS = 1;
 */
@Data
public class User {
    Integer userId;
    String userName;
    Integer idCardRef;
    String phoneNumber;
}
