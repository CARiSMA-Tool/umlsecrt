package aspects;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Collection;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import test.A;
import other.B;

import larva.*;
public aspect _asp_secureDependency0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_secureDependency0.initialize();
}
}
after () returning () : (call(* *.m2(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 7/*returnM2*/, 9/*exit*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 7/*returnM2*/, 9/*exit*/);
}
}
after () returning () : (call(* *.m1(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 5/*returnM1*/, 9/*exit*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 5/*returnM1*/, 9/*exit*/);
}
}
before () : (call(* *.m1(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="m1";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 0/*enterM1*/, 4/*enter*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 0/*enterM1*/, 4/*enter*/);
}
}
before () : (call(* *.m2(..)) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_secureDependency0.lock){
String id;
id ="m2";

_cls_secureDependency0 _cls_inst = _cls_secureDependency0._get_cls_secureDependency0_inst();
_cls_secureDependency0.id = id;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 2/*enterM2*/, 4/*enter*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 2/*enterM2*/, 4/*enter*/);
}
}
}