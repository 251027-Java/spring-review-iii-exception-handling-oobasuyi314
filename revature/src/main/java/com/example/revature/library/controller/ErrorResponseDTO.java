import com.revature.library.model.Book;
import com.revature.library.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public class ErrorResponseDTO {
    private String message;
    private int status;
    private LocalDateTime timestamp;
}
