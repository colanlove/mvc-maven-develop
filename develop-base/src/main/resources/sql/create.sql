
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(32) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'zhangsan', '123');
INSERT INTO `t_user` VALUES ('2', 'lisi', '456');
INSERT INTO `t_user` VALUES ('3', 'wangwu', '789');