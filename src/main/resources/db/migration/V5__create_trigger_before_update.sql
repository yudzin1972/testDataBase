CREATE TRIGGER `temp_BEFORE_UPDATE` BEFORE UPDATE ON `temp` FOR EACH ROW BEGIN
    set new.updated=now();
END