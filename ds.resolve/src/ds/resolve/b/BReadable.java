package ds.resolve.b;

import java.io.IOException;
import java.nio.CharBuffer;

import org.osgi.service.component.annotations.Component;

@Component(property = "type=other")
public class BReadable implements Readable {

	@Override
	public int read(CharBuffer cb) throws IOException {

		return 0;
	}

}
