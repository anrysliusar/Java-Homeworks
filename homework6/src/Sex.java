import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public enum Sex {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private String sex;
}
