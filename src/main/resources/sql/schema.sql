CREATE TABLE `wechatpro`.`area` (
  `area_id` INT NOT NULL AUTO_INCREMENT,
  `area_name` VARCHAR(200) NULL,
  `priority` INT NULL DEFAULT 0,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `last_edit_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`area_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1000
DEFAULT CHARACTER SET = utf8;

INSERT INTO `wechatpro`.`area` (`area_id`, `area_name`, `priority`) VALUES ('1000', '南京', '9');
INSERT INTO `wechatpro`.`area` (`area_id`, `area_name`, `priority`) VALUES ('1001', '北京', '8');
