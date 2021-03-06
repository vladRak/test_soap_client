-- Сделать таблицу с информацией о сотрудниках, таблицу о полученной зарплате за каждый месяц
-- Наполнить тестовыми данными

-- Make tables:
--      employees information,
--      received salary for each month;
-- Fill with test data.

DROP SCHEMA IF EXISTS `test_task_db`;

CREATE SCHEMA IF NOT EXISTS `test_task_db` DEFAULT CHARACTER SET utf8;

USE `test_task_db`;

-- #
-- # TABLE employee
-- #

DROP TABLE IF EXISTS `test_task_db`.`employee`;

CREATE TABLE `test_task_db`.`employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `age` SMALLINT(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB
AUTO_INCREMENT=21
DEFAULT CHARACTER SET = utf8;

-- #
-- # TABLE salary
-- #

DROP TABLE IF EXISTS `test_task_db`.`salary`;

CREATE TABLE `test_task_db`.`salary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` INT(11) NOT NULL,
  `months` SMALLINT(2) NOT NULL,
  `pay` int(11) NOT NULL,
  PRIMARY KEY (`id`,`employee_id`),
  INDEX `fk_salary_employee_idx` (`employee_id`),
  CONSTRAINT `fk_salary_employee`
  FOREIGN KEY (`employee_id`)
  REFERENCES `employee` (`id`)
  ON DELETE RESTRICT
  ON UPDATE CASCADE
) ENGINE=InnoDB
AUTO_INCREMENT=241
DEFAULT CHARACTER SET = utf8;


-- This is does not handmade :)
-- Data was generated using http://filldb.info in format like this:

-- INSERT INTO `salary` (`id`, `employee_id`, `months`, `pay`) VALUES (1, 1, 9, 12207);
-- ...
-- INSERT INTO `salary` (`id`, `employee_id`, `months`, `pay`) VALUES (240, 20, 11, 12639);

-- Only replaced 100500 slow inserts on two fast inserts.

INSERT INTO `employee`
(`id`, `first_name`, `last_name`, `age`) VALUES
 (1, 'Orion', 'Medhurst', 44),
 (2, 'Norma', 'Corkery', 36),
 (3, 'Dianna', 'Kuvalis', 49),
 (4, 'Curt', 'Pfannerstill', 60),
 (5, 'Alphonso', 'Reinger', 60),
 (6, 'Evans', 'Lang', 52),
 (7, 'Bret', 'Leuschke', 58),
 (8, 'Roberta', 'Wunsch', 43),
 (9, 'Arnaldo', 'Keeling', 51),
 (10, 'Noelia', 'Hegmann', 38),
 (11, 'Aubree', 'Stehr', 58),
 (12, 'Richmond', 'Altenwerth', 38),
 (13, 'Quinton', 'Hand', 53),
 (14, 'Hilton', 'Huels', 37),
 (15, 'Pablo', 'Thompson', 32),
 (16, 'Burdette', 'Murazik', 45),
 (17, 'Tracey', 'Gibson', 37),
 (18, 'Sylvan', 'Larson', 49),
 (19, 'Frank', 'Schiller', 46),
 (20, 'Beryl', 'Murray', 34);

INSERT INTO `salary`
(`id`, `employee_id`, `months`, `pay`) VALUES
 (1, 1, 9, 12207),
 (2, 2, 1, 7784),
 (3, 3, 8, 11351),
 (4, 4, 8, 8983),
 (5, 5, 1, 9279),
 (6, 6, 10, 12197),
 (7, 7, 3, 6408),
 (8, 8, 8, 1554),
 (9, 9, 9, 9199),
 (10, 10, 10, 1842),
 (11, 11, 1, 2228),
 (12, 12, 12, 5729),
 (13, 13, 5, 65),
 (14, 14, 8, 5825),
 (15, 15, 7, 790),
 (16, 16, 9, 5102),
 (17, 17, 10, 2683),
 (18, 18, 4, 1948),
 (19, 19, 1, 3892),
 (20, 20, 6, 3367),
 (21, 1, 7, 11693),
 (22, 2, 3, 8276),
 (23, 3, 1, 7173),
 (24, 4, 5, 10801),
 (25, 5, 12, 12380),
 (26, 6, 2, 3595),
 (27, 7, 5, 3747),
 (28, 8, 5, 12110),
 (29, 9, 6, 2880),
 (30, 10, 6, 14918),
 (31, 11, 6, 3870),
 (32, 12, 3, 2016),
 (33, 13, 12, 753),
 (34, 14, 9, 5256),
 (35, 15, 6, 4778),
 (36, 16, 8, 2900),
 (37, 17, 10, 11379),
 (38, 18, 8, 4954),
 (39, 19, 7, 3230),
 (40, 20, 7, 5132),
 (41, 1, 8, 5704),
 (42, 2, 11, 5602),
 (43, 3, 4, 8655),
 (44, 4, 7, 7390),
 (45, 5, 9, 4652),
 (46, 6, 7, 7897),
 (47, 7, 1, 9469),
 (48, 8, 7, 10060),
 (49, 9, 6, 10369),
 (50, 10, 3, 6428),
 (51, 11, 5, 1276),
 (52, 12, 7, 160),
 (53, 13, 3, 1388),
 (54, 14, 2, 3000),
 (55, 15, 4, 1476),
 (56, 16, 8, 14355),
 (57, 17, 6, 11734),
 (58, 18, 10, 12432),
 (59, 19, 9, 13113),
 (60, 20, 7, 2021),
 (61, 1, 7, 11497),
 (62, 2, 3, 13034),
 (63, 3, 9, 9156),
 (64, 4, 9, 12973),
 (65, 5, 11, 2172),
 (66, 6, 7, 12504),
 (67, 7, 1, 6430),
 (68, 8, 10, 9929),
 (69, 9, 1, 573),
 (70, 10, 3, 5196),
 (71, 11, 12, 944),
 (72, 12, 5, 1409),
 (73, 13, 2, 8059),
 (74, 14, 8, 13920),
 (75, 15, 2, 4089),
 (76, 16, 5, 4814),
 (77, 17, 7, 5791),
 (78, 18, 7, 5022),
 (79, 19, 11, 6704),
 (80, 20, 4, 1312),
 (81, 1, 9, 10979),
 (82, 2, 7, 8022),
 (83, 3, 11, 13989),
 (84, 4, 8, 14017),
 (85, 5, 12, 5473),
 (86, 6, 4, 3615),
 (87, 7, 9, 6778),
 (88, 8, 5, 2940),
 (89, 9, 5, 5367),
 (90, 10, 6, 1389),
 (91, 11, 11, 6058),
 (92, 12, 8, 12985),
 (93, 13, 4, 8255),
 (94, 14, 10, 11177),
 (95, 15, 12, 11702),
 (96, 16, 6, 14973),
 (97, 17, 8, 3122),
 (98, 18, 11, 12877),
 (99, 19, 1, 6778),
 (100, 20, 11, 4846),
 (101, 1, 9, 12903),
 (102, 2, 5, 6547),
 (103, 3, 5, 11413),
 (104, 4, 5, 8386),
 (105, 5, 7, 3606),
 (106, 6, 3, 9731),
 (107, 7, 3, 1677),
 (108, 8, 12, 6130),
 (109, 9, 11, 13652),
 (110, 10, 4, 8805),
 (111, 11, 6, 14196),
 (112, 12, 8, 14814),
 (113, 13, 12, 3522),
 (114, 14, 11, 7222),
 (115, 15, 7, 12905),
 (116, 16, 2, 8916),
 (117, 17, 10, 5429),
 (118, 18, 10, 456),
 (119, 19, 4, 8782),
 (120, 20, 7, 3763),
 (121, 1, 1, 846),
 (122, 2, 5, 1139),
 (123, 3, 1, 3082),
 (124, 4, 9, 5893),
 (125, 5, 11, 11571),
 (126, 6, 8, 12669),
 (127, 7, 3, 12783),
 (128, 8, 12, 10379),
 (129, 9, 2, 13505),
 (130, 10, 2, 10352),
 (131, 11, 12, 5494),
 (132, 12, 9, 2088),
 (133, 13, 3, 6459),
 (134, 14, 12, 7892),
 (135, 15, 3, 6740),
 (136, 16, 5, 14270),
 (137, 17, 1, 4724),
 (138, 18, 10, 15),
 (139, 19, 7, 10776),
 (140, 20, 3, 10524),
 (141, 1, 12, 13531),
 (142, 2, 6, 11503),
 (143, 3, 9, 1242),
 (144, 4, 3, 5109),
 (145, 5, 10, 11864),
 (146, 6, 2, 8458),
 (147, 7, 5, 7824),
 (148, 8, 6, 1146),
 (149, 9, 8, 6027),
 (150, 10, 9, 7694),
 (151, 11, 7, 2170),
 (152, 12, 6, 9313),
 (153, 13, 8, 9742),
 (154, 14, 3, 14704),
 (155, 15, 7, 8690),
 (156, 16, 5, 173),
 (157, 17, 6, 7628),
 (158, 18, 3, 8905),
 (159, 19, 11, 12764),
 (160, 20, 8, 11215),
 (161, 1, 9, 2535),
 (162, 2, 3, 9576),
 (163, 3, 1, 2594),
 (164, 4, 8, 633),
 (165, 5, 6, 1074),
 (166, 6, 12, 13026),
 (167, 7, 3, 11139),
 (168, 8, 10, 9052),
 (169, 9, 11, 4748),
 (170, 10, 9, 14476),
 (171, 11, 8, 6616),
 (172, 12, 5, 1215),
 (173, 13, 5, 2516),
 (174, 14, 12, 8489),
 (175, 15, 8, 11730),
 (176, 16, 7, 14182),
 (177, 17, 10, 14791),
 (178, 18, 12, 1399),
 (179, 19, 8, 8776),
 (180, 20, 1, 3499),
 (181, 1, 9, 2071),
 (182, 2, 1, 9262),
 (183, 3, 2, 423),
 (184, 4, 6, 7875),
 (185, 5, 8, 2254),
 (186, 6, 11, 7791),
 (187, 7, 2, 10646),
 (188, 8, 1, 10014),
 (189, 9, 8, 9991),
 (190, 10, 11, 1426),
 (191, 11, 11, 9126),
 (192, 12, 10, 2082),
 (193, 13, 12, 2224),
 (194, 14, 4, 1979),
 (195, 15, 3, 10890),
 (196, 16, 3, 13108),
 (197, 17, 9, 7937),
 (198, 18, 10, 12396),
 (199, 19, 4, 6499),
 (200, 20, 7, 3037),
 (201, 1, 4, 6680),
 (202, 2, 3, 8249),
 (203, 3, 12, 13100),
 (204, 4, 11, 13419),
 (205, 5, 1, 12303),
 (206, 6, 9, 9137),
 (207, 7, 1, 3103),
 (208, 8, 6, 12562),
 (209, 9, 5, 2659),
 (210, 10, 4, 11037),
 (211, 11, 10, 217),
 (212, 12, 4, 13282),
 (213, 13, 11, 8305),
 (214, 14, 1, 5304),
 (215, 15, 9, 2725),
 (216, 16, 8, 13537),
 (217, 17, 9, 13685),
 (218, 18, 9, 10096),
 (219, 19, 10, 14196),
 (220, 20, 1, 6770),
 (221, 1, 10, 11790),
 (222, 2, 2, 788),
 (223, 3, 3, 8625),
 (224, 4, 4, 7987),
 (225, 5, 9, 3079),
 (226, 6, 2, 2203),
 (227, 7, 3, 8998),
 (228, 8, 1, 13675),
 (229, 9, 8, 5484),
 (230, 10, 4, 14137),
 (231, 11, 6, 9587),
 (232, 12, 3, 10991),
 (233, 13, 12, 9385),
 (234, 14, 2, 9497),
 (235, 15, 10, 10932),
 (236, 16, 3, 6515),
 (237, 17, 5, 2382),
 (238, 18, 11, 11878),
 (239, 19, 6, 515),
 (240, 20, 11, 12639);