/*
 *  Copyright (C) 2010-2015 JPEXS, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.decompiler.flash.abc.avm2.instructions.localregs;

import com.jpexs.decompiler.flash.abc.avm2.instructions.AVM2Instruction;

public class SetLocal2Ins extends SetLocalTypeIns {

    public SetLocal2Ins() {
        super(0xd6, "setlocal_2", new int[]{}, false);
    }

    @Override
    public int getRegisterId(AVM2Instruction ins) {
        return 2;
    }
}
