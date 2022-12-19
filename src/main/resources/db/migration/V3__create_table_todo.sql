
CREATE TABLE `todo` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `completed` bit(1) DEFAULT NULL,
  `title` varchar(255) NOT NULL,
   `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
   `status` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgnsyu2l292l4pvwnbaxed91j5` (`user_id`),
  CONSTRAINT `FKgnsyu2l292l4pvwnbaxed91j5` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

