CREATE TABLE `temp` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  `d1` datetime DEFAULT NULL,
  `field2` tinyblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

