package org.example.springformysql.domain;

import lombok.Data;
import org.w3c.dom.Text;


@Data
public class articleCategories {

    private int CategoryID;
    private String CategoryName;
    private Text Description ;
}
