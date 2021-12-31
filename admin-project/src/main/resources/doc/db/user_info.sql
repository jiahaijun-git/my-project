DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
                              `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                              `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
                              `sex` int(11) NULL DEFAULT NULL COMMENT '性别（1男  2女）',
                              `brithday` datetime(0) NULL DEFAULT NULL COMMENT '出生日期',
                              `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '电话',
                              `is_del` int(11) NULL DEFAULT NULL COMMENT '是否删除（0否  1是）',
                              `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
                              `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
                              PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;