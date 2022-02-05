import java.util.Objects;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public  class Alien 
{
private int  age;
private String name;
private String tech;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}



