package youtube.entities.comments;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentsResponse {

    public List<CommentsItems> items;

}
