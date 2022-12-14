package roy.aman.bankingmanagementsystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Integer userID;

    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String fullName;
    @Column(unique = true,nullable = false)
    private String mobile;

//    private String username;

    private Date dateOfBirth;

    @Column(nullable = false)
    private String password;

    private String address;
    @OneToMany
    private List<Account> activeAccounts;


}
