CREATE TRIGGER `temp_BEFORE_INSERT` BEFORE INSERT ON `temp` FOR EACH ROW BEGIN
	set new.created=ifnull(new.created,now());
    set new.updated=now();
END