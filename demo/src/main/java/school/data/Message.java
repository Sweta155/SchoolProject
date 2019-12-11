package school.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Message {
	@NonNull
	private String messageTo;
	@NonNull
	private String messageFrom;
	@NonNull
	private String messageSubject;
	private String messageBody;

}
