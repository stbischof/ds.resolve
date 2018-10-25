# ds.resolve

## reproduce:

### bndtools/eclipse

push the resolve button at ds.resolve/resolveActive.bndrun

### commands
```
git clone https://github.com/stbischof/ds.resolve.git
cd ds.resolve

java -jar biz.aQute.bnd-4.1.0.jar clean
java -jar biz.aQute.bnd-4.1.0.jar _par
java -jar biz.aQute.bnd-4.1.0.jar resolve resolve --write ds.resolve/resolveActive.bndrun
git diff
```

### results:
```
+-runbundles: \
+       ds.resolve.b;version=snapshot,\
+       ds.resolve.cap;version=snapshot,\
+       ds.resolve.capfora;version=snapshot,\
+       ds.resolve.req;version=snapshot,\
+       org.apache.felix.scr;version='[2.1.0,2.1.1)'
```

##  description
try to resolve `bundle req`
- `bundle req` has the requirement `namespace="ns",name="name"`


so we look for the same capability `namespace="ns",name="name"`
- bundle cap has the capability `namespace="ns",name="name"`
- but `bundle cap` has also a Requirement `osgi.service;filter:="(objectClass=java.lang.Readable)";effective:=active;cardinality:=multiple`.
- this could be providet by itsselve `osgi.service;objectClass:List<String>="java.lang.Readable"` (target property of @Reference is not processed)

### Issues:
- it resolves `bundle capfora` which provides a capability that is required by `bundle a` -> provides also the capability that is required from `bundle cap` ( `osgi.service;objectClass:List<String>="java.lang.Readable"`).
- But in this case `bundle a` is not in the resolveresult
- bundle b is also resolved. (not needet, cap has the needet capability by its own)


