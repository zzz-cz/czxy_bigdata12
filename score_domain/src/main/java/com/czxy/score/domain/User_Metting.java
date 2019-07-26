package com.czxy.score.domain;

import javax.persistence.Table;

@Table(name = "tab_user_metting")
public class User_Metting {
    /*  `umid` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) DEFAULT NULL,
  `metting_id` INT(11) DEFAULT NULL,
  PRIMARY KEY (`umid`)
) ENGINE=INNODB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
*/

    private Integer umid;
    private Integer user_id;
    private Integer metting_id;
}
