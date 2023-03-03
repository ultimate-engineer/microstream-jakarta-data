package os.expert.integration.microstream;

import jakarta.nosql.Column;
import jakarta.nosql.Id;

import java.time.Year;

public class Animal {

    @Id
    private String id;


    @Column
    private String name;

    @Column
    private Year year;
}
