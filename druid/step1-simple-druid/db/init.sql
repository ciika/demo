CREATE TABLE `users`
(
    `user_id`   BIGINT(20) NOT NULL,
    `user_name` VARCHAR(50) DEFAULT NULL,
    `user_age`  INT(11) DEFAULT NULL,
    PRIMARY KEY (`user_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `users`
VALUES (1, '张三', 30);
INSERT INTO `users`
VALUES (2, '李四', 40);
INSERT INTO `users`
VALUES (3, '王五', 50);
