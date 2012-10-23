/***
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package de.mangelow.syncwifi;

import java.util.Comparator;

import de.mangelow.syncwifi.Ac;


public class MyNameComparable implements Comparator<Object>{	 


	public int compare(Object o1, Object o2) {

		Ac p1 = (Ac)o1;
		Ac p2 = (Ac)o2;

		if(p1.getAccount().name != null && p2.getAccount().name != null){
			return p1.getAccount().name.compareTo(p2.getAccount().name);
		}
		return 0;
	}	
}