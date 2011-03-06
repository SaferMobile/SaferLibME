/*
 * Copyright (C) 2005 Luca Veltri - University of Parma - Italy
 * 
 * This file is part of MjSip (http://www.mjsip.org)
 * 
 * MjSip is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * MjSip is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with MjSip; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * Author(s):
 * Luca Veltri (luca.veltri@unipr.it)
 */

package java.net;




/** IpAddress is an IP address.
  */
public class IpAddress
{

   /** The host address/name */
   String address;

 
   // ********************* Protected *********************

   /** Inits the IpAddress */
   private void init(String address)
   {  this.address=address;
   }


   // ********************** Public ***********************

   /** Creates an IpAddress */
   public IpAddress(String address)
   {  init(address);
   }
 
   /** Creates an IpAddress */
   public IpAddress(IpAddress ipaddr)
   {  init(ipaddr.address);
   }

   /** Makes a copy */
   public Object clone()
   {  return new IpAddress(this);
   }

   /** Wthether it is equal to Object <i>obj</i> */
   public boolean equals(Object obj)
   {  try
      {  IpAddress ipaddr=(IpAddress)obj;
         if (!toString().equals(ipaddr.toString())) return false;
         return true;
      }
      catch (Exception e) {  return false;  }
   }

   /** Gets a String representation of the Object */
   public String toString()
   {  return address;
   }
   

   // *********************** Static ***********************

   /** Gets the IpAddress for a given fully-qualified host name. */
   public static IpAddress getByName(String host_addr) throws java.io.IOException
   {  return new IpAddress(host_addr);
   }


   /** Detects the default IP address of this host. */
   public static IpAddress getLocalHostAddress()
   {  return new IpAddress("127.0.0.1");
   }

}