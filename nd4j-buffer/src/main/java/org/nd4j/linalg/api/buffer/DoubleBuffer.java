/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 *
 */

package org.nd4j.linalg.api.buffer;


import io.netty.buffer.ByteBuf;
import org.nd4j.linalg.api.complex.IComplexDouble;
import org.nd4j.linalg.api.complex.IComplexFloat;

import java.nio.ByteBuffer;

/**
 * Double buffer implementation of data buffer
 *
 * @author Adam Gibson
 */
public class DoubleBuffer extends BaseDataBuffer {
    public DoubleBuffer(long length) {
        super(length);
    }

    public DoubleBuffer(long length, boolean initialize){
        super(length, initialize);
    }

    public DoubleBuffer(int length, int elementSize) {
        super(length, elementSize);
    }

    public DoubleBuffer(int length, int elementSize, int offset) {
        super(length, elementSize, offset);
    }

    public DoubleBuffer(DataBuffer underlyingBuffer, long length, long offset) {
        super(underlyingBuffer, length, offset);
    }


    public DoubleBuffer(ByteBuf buf,int length) {
        super(buf,length);
    }

    public DoubleBuffer(ByteBuf buf, int length, int offset) {
        super(buf, length, offset);
    }

    public DoubleBuffer(double[] data) {
        super(data);
    }

    public DoubleBuffer(int[] data) {
        this(data, true);
    }

    public DoubleBuffer(int[] data, boolean copyOnOps) {
        super(data, copyOnOps);
    }

    public DoubleBuffer(int[] data, boolean copy, int offset) {
        super(data, copy, offset);
    }

    public DoubleBuffer(float[] data) {
        this(data, true);
    }

    public DoubleBuffer(float[] data, boolean copyOnOps) {
        super(data, copyOnOps);
    }

    public DoubleBuffer(float[] data, boolean copy, int offset) {
        super(data, copy, offset);
    }

    public DoubleBuffer(ByteBuffer buffer,int length) {
        super(buffer,length);
    }

    public DoubleBuffer(ByteBuffer buffer, int length, int offset) {
        super(buffer, length, offset);
    }

    public DoubleBuffer(byte[] data, int length) {
        super(data, length);
    }

    @Override
    public DataBuffer create(ByteBuf buf,int length) {
        return new DoubleBuffer(buf,length);
    }

    @Override
    public IComplexFloat getComplexFloat(long i) {
        return null;
    }

    @Override
    public IComplexDouble getComplexDouble(long i) {
        return null;
    }

    public DoubleBuffer(double[] doubles, boolean copy) {
        super(doubles, copy);
    }

    public DoubleBuffer(double[] data, boolean copy, int offset) {
        super(data, copy, offset);
    }


    @Override
    public DataBuffer.Type dataType() {
        return DataBuffer.Type.DOUBLE;
    }




    @Override
    public float getFloat(long i) {
        return (float) getDouble(i);
    }

    @Override
    public Number getNumber(long i) {
        return  getDouble(i);
    }

    @Override
    public DataBuffer create(double[] data) {
        return new DoubleBuffer(data);
    }

    @Override
    public DataBuffer create(float[] data) {
        return new DoubleBuffer(data);
    }

    @Override
    public DataBuffer create(int[] data) {
        return new DoubleBuffer(data);
    }
    @Override
    protected DataBuffer create(long length) {
        return new DoubleBuffer(length);
    }


    @Override
    public void flush() {
    }

    @Override
    public int getElementSize() {
        return 8;
    }



}
