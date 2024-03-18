package org.glavo.classfile;

import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.function.Consumer;

import org.glavo.classfile.constantpool.Utf8Entry;

public interface ClassBuilder {

	default ClassBuilder withMethodBody(Utf8Entry name, Utf8Entry descriptor, int methodFlags,
			Consumer<? super CodeBuilder> handler) {
		return null;
//return withMethod(name, descriptor, methodFlags, mb -> mb.withCode(handler));
	}

	ClassBuilder withFlags(int i);

    default ClassBuilder withSuperclass(ClassDesc c) {
		return null;
//        return withSuperclass(constantPool().classEntry(desc));
    }

	ClassBuilder withMethodBody(String string, MethodTypeDesc mTD_Constructor, int accPublic,
			Consumer<? super CodeBuilder> handler);

	ClassBuilder withField(String string, ClassDesc cdInt, int accPublic);

	ClassBuilder with(Object of);

}
