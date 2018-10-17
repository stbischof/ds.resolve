package ds.resolve.a;

import java.io.IOException;
import java.nio.CharBuffer;

import org.osgi.annotation.bundle.Requirement;
import org.osgi.service.component.annotations.Component;

@Requirement(namespace="ns",name="a")
@Component(property = "type=other")
public class AReadable implements Readable {

	@Override
	public int read(CharBuffer cb) throws IOException {

		return 0;
	}

}
