/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class5 {
	public Object anObject36;
	public Object anObject37;

	public Class5(Object object, Object object_0_) {
		anObject37 = object;
		anObject36 = object_0_;
	}

	public int method522() {
		int i = 0;
		if (anObject37 != null)
			i += anObject37.hashCode();
		if (anObject36 != null)
			i += 31 * anObject36.hashCode();
		return i;
	}

	public boolean equals(Object object) {
		if (object == null || !(object instanceof Class5))
			return false;
		Class5 class5_1_ = (Class5) object;
		if (anObject37 == null) {
			if (class5_1_.anObject37 != null)
				return false;
		} else if (!anObject37.equals(class5_1_.anObject37))
			return false;
		if (anObject36 == null) {
			if (class5_1_.anObject36 != null)
				return false;
		} else if (!anObject36.equals(class5_1_.anObject36))
			return false;
		return true;
	}

	public int hashCode() {
		int i = 0;
		if (anObject37 != null)
			i += anObject37.hashCode();
		if (anObject36 != null)
			i += 31 * anObject36.hashCode();
		return i;
	}

	public boolean method523(Object object) {
		if (object == null || !(object instanceof Class5))
			return false;
		Class5 class5_2_ = (Class5) object;
		if (anObject37 == null) {
			if (class5_2_.anObject37 != null)
				return false;
		} else if (!anObject37.equals(class5_2_.anObject37))
			return false;
		if (anObject36 == null) {
			if (class5_2_.anObject36 != null)
				return false;
		} else if (!anObject36.equals(class5_2_.anObject36))
			return false;
		return true;
	}

	public String toString() {
		return new StringBuilder().append(anObject37).append(", ").append(anObject36).toString();
	}

	public String method524() {
		return new StringBuilder().append(anObject37).append(", ").append(anObject36).toString();
	}
}
