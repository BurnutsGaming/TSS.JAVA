package tss.tpm;

import tss.*;
import java.util.*;

// -----------This is an auto-generated file: do not edit

//>>>

/** Table 17 Defines for SM3_256 Hash Values */
public final class SM3_256 extends TpmEnum<SM3_256>
{
    /** Values from enum _N are only intended to be used in case labels of a switch statement
     *  using the result of this.asEnum() method as the switch condition. However, their Java
     *  names are identical to those of the constants defined in this class further below, so
     *  for any other usage just prepend them with the SM3_256. qualifier.
     */
    public enum _N {
        /** Size of digest in octets */
        DIGEST_SIZE,

        /** Size of hash block in octets */
        BLOCK_SIZE
    }

    private static ValueMap<SM3_256> _ValueMap = new ValueMap<SM3_256>();

    /** These definitions provide mapping of the Java enum constants to their TPM integer values */
    public static final SM3_256
        DIGEST_SIZE = new SM3_256(32, _N.DIGEST_SIZE),
        BLOCK_SIZE = new SM3_256(64, _N.BLOCK_SIZE);

    public SM3_256 () { super(0, _ValueMap); }
    public SM3_256 (int value) { super(value, _ValueMap); }
    public static SM3_256 fromInt (int value) { return TpmEnum.fromInt(value, _ValueMap, SM3_256.class); }
    public static SM3_256 fromTpm (byte[] buf) { return TpmEnum.fromTpm(buf, _ValueMap, SM3_256.class); }
    public static SM3_256 fromTpm (TpmBuffer buf) { return TpmEnum.fromTpm(buf, _ValueMap, SM3_256.class); }
    public SM3_256._N asEnum() { return (SM3_256._N)NameAsEnum; }
    public static Collection<SM3_256> values() { return _ValueMap.values(); }
    private SM3_256 (int value, _N nameAsEnum) { super(value, nameAsEnum, _ValueMap); }
    private SM3_256 (int value, _N nameAsEnum, boolean noConvFromInt) { super(value, nameAsEnum, null); }

    @Override
    protected int wireSize() { return 4; }
}

//<<<
