package org.glavo.classfile;

import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.function.Consumer;

import org.glavo.classfile.constantpool.FieldRefEntry;
import org.glavo.classfile.constantpool.LoadableConstantEntry;

public interface CodeBuilder {

    interface BlockCodeBuilder extends CodeBuilder {
/**
 * {@return the label locating where control is passed back to the parent block.}
 * A branch to this label "break"'s out of the current block.
 * <p>
 * If an instruction occurring immediately after the built block's last instruction would
 * be reachable from that last instruction, then a {@linkplain #goto_ goto} instruction
 * targeting the "break" label is appended to the built block.
 */
Label breakLabel();
}

	Label newLabel();

	CodeBuilder labelBinding(Label begScope);

	CodeBuilder lineNumber(int i);

	CodeBuilder localVariable(int i, String string, ClassDesc of, Label begScope, Label endScope);

	CodeBuilder aload(int i);

	CodeBuilder invokespecial(Object methodRefEntry);

	CodeBuilder putfield(Object fieldRefEntry);

	CodeBuilder invokevirtual(Object methodRefEntry);

	CodeBuilder return_();

	CodeBuilder invokestatic(ClassDesc of, String string, MethodTypeDesc ofDescriptor);

	CodeBuilder new_(ClassDesc of);

	CodeBuilder dup();

	CodeBuilder getfield(FieldRefEntry fD_I);

	CodeBuilder getstatic(ClassDesc of, String string, ClassDesc of2);

	CodeBuilder invokespecial(ClassDesc of, String string, MethodTypeDesc ofDescriptor);

	CodeBuilder pop();


	CodeBuilder bipush(int i);
	CodeBuilder sipush(int i);
	CodeBuilder ldc(LoadableConstantEntry entry);

	CodeBuilder aconst_null();
	CodeBuilder dconst_0();
	CodeBuilder dconst_1();
	CodeBuilder fconst_0();
	CodeBuilder fconst_1();
	CodeBuilder fconst_2();
	CodeBuilder iconst_0();
	CodeBuilder iconst_1();
	CodeBuilder iconst_2();
	CodeBuilder iconst_3();
	CodeBuilder iconst_4();
	CodeBuilder iconst_5();
	
	CodeBuilder iadd();
	CodeBuilder idiv();
	CodeBuilder isub();
	CodeBuilder imul();
	CodeBuilder ineg();

	CodeBuilder if_icmplt(Label target);
	CodeBuilder if_icmpeq(Label target);
	CodeBuilder if_icmple(Label target);
	CodeBuilder if_icmpgt(Label target);
	CodeBuilder if_icmpne(Label target);
	CodeBuilder if_icmpge(Label target);
	

	void ifThenElse(Consumer<BlockCodeBuilder> thenHandler, Consumer<BlockCodeBuilder> elseHandler);

	CodeBuilder goto_(Label endLabel);

	CodeBuilder ifeq(Label elseLabel);

	CodeBuilder iload(int i);
	CodeBuilder dload(int ofst);
	CodeBuilder fload(int ofst);

	CodeBuilder ireturn();
	CodeBuilder areturn();

	void checkcast(ClassDesc cD_cls);

	CodeBuilder fneg();
	CodeBuilder dneg();

	CodeBuilder anewarray(ClassDesc of);

	CodeBuilder aastore();

	CodeBuilder iand();

	CodeBuilder ior();

	CodeBuilder ifne(Label l1);

	CodeBuilder iastore();

	CodeBuilder newarray(TypeKind inttype);

	CodeBuilder if_null(Label endifLabel);

	CodeBuilder fadd();

	CodeBuilder dadd();

	CodeBuilder i2f();

	CodeBuilder d2f();

	CodeBuilder i2d();

	CodeBuilder f2d();

	CodeBuilder iflt(Label target);

	CodeBuilder ifle(Label target);

	CodeBuilder ifgt(Label target);

	CodeBuilder ifge(Label target);

	CodeBuilder fcmpl();

	CodeBuilder dcmpl();

	CodeBuilder fsub();

	CodeBuilder fmul();

	CodeBuilder fdiv();

	CodeBuilder dsub();

	CodeBuilder dmul();

	CodeBuilder ddiv();

	CodeBuilder getfield(ClassDesc cD_RTObject, String string, ClassDesc cD_RTObject2);

}
