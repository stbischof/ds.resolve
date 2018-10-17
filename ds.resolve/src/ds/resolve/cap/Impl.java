package ds.resolve.cap;

import org.osgi.annotation.bundle.Capability;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Capability(namespace="ns",name="name")
@Component
public class Impl {

	@Reference(policy = ReferencePolicy.DYNAMIC, cardinality = ReferenceCardinality.AT_LEAST_ONE, target = "(type=test)")
	public void bindReadableTest(Readable readable) {

	}

	public void unbindReadableTest(Readable readable) {

	}

	@Reference(policy = ReferencePolicy.DYNAMIC, cardinality = ReferenceCardinality.MULTIPLE, target = "(type=other)")
	public void bindReadableOther(Readable readable) {

	}

	public void unbindReadableOther(Readable readable) {

	}

}
