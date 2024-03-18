package org.glavo.classfile.constantpool;

import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.util.Set;

public interface ConstantPoolBuilder {

	public static ConstantPoolBuilder of(Set<Object> emptySet) {
		// TODO Auto-generated method stub
		return null;
	}

	public FieldRefEntry fieldRefEntry(ClassDesc of, String string, ClassDesc cdInt);

	public Object methodRefEntry(ClassDesc of, String string, MethodTypeDesc ofDescriptor);

	public LoadableConstantEntry stringEntry(String string);

	public IntegerEntry intEntry(int i);

	public LoadableConstantEntry doubleEntry(double d);

	public LoadableConstantEntry floatEntry(float f);

}
