package ds.resolve.cap;

import java.io.IOException;
import java.nio.CharBuffer;

import org.osgi.service.component.annotations.Component;

@Component(property = "type=test")
public class DefaultReadable implements Readable {

	@Override
	public int read(CharBuffer cb) throws IOException {

		return 0;
	}

}
