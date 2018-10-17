# ds.resolve

try to resolve `bundle req`
- `bundle req` has the requirement `namespace="ns",name="name"`


so we look for the same capability `namespace="ns",name="name"`
- bundle cap has the capability `namespace="ns",name="name"`
- but `bundle cap` has also a Requirement `osgi.service;filter:="(objectClass=java.lang.Readable)";effective:=active;cardinality:=multiple` whick could be providet by itsselve `osgi.service;objectClass:List<String>="java.lang.Readable"` (target property of @Reference is not processed)


BUT THE RESULT IS THAT:
it resolves `bundle capfora` which provides a capability that is required by `bundle a` -> provides also the capability that is required from `bundle cap` ( `osgi.service;objectClass:List<String>="java.lang.Readable"`). But in this case `bundle a` is not in the resolveresult

 
When uncomment @Component(property = "type=test") in DefaultReadable there are some other Results i could not explaine
