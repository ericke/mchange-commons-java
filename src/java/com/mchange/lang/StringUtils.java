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


package com.mchange.lang;

import java.io.UnsupportedEncodingException;

/**
 * @deprecated use com.mchange.v2.lang.StringUtils (JDK 1.4+)
 */
public final class StringUtils
{
    public final static String[] EMPTY_STRING_ARRAY = new String[0];

    public static String normalString(String s)
    { return nonEmptyTrimmedOrNull(s); }

    public static boolean nonEmptyString(String s)
    {return (s != null && s.length() > 0);}

    public static boolean nonWhitespaceString(String s)
    {return (s != null && s.trim().length() > 0);}

    public static String nonEmptyOrNull(String s)
    {return ( nonEmptyString(s) ? s : null );}

    public static String nonNullOrBlank(String s)
    {return ( s!= null ? s : "" );}

    public static String nonEmptyTrimmedOrNull(String s)
    {
        String out = s;
        if (out != null)
            {
                out = out.trim();
                out = (out.length() > 0 ? out : null);
            }
        return out;
    }

    public static byte[] getUTF8Bytes( String s )
    {
	try
	    { return s.getBytes( "UTF8" ); }
	catch (UnsupportedEncodingException e)
	    {
		e.printStackTrace();
		throw new InternalError("UTF8 is an unsupported encoding?!?");
	    }
    }
}


