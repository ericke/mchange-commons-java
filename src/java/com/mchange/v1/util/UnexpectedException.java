/*
 * Distributed as part of mchange-commons-java v.0.2.3
 *
 * Copyright (C) 2012 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 2.1, as 
 * published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; see the file LICENSE.  If not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 */


package com.mchange.v1.util;

import com.mchange.lang.PotentiallySecondaryRuntimeException;

public class UnexpectedException extends PotentiallySecondaryRuntimeException
{
    public UnexpectedException(String msg, Throwable t)
    {super(msg, t);}

    public UnexpectedException(Throwable t)
    {super(t);}

    public UnexpectedException(String msg)
    {super(msg);}

    public UnexpectedException()
    {super();}

    /** @deprecated **/
    public UnexpectedException(Throwable nested, String msg)
    {this(msg, nested);}
}
