/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.0
 */
#include "mavlink_debug_msg.h"

void mavlink_debug_msg_send(const struct debug_msg* n_var0, uint8_t* n_var1,
                            uint8_t n_var2[80U])
{
    uint8_t n_local0[9U] = {};
    uint8_t* n_ref1 = n_local0;
    uint32_t n_deref2 = n_var0->time_boot_ms;
    
    mavlink_pack_uint32_t((uint8_t*) n_ref1, 0U, n_deref2);
    
    float n_deref3 = n_var0->value;
    
    mavlink_pack_float((uint8_t*) n_ref1, 4U, n_deref3);
    
    uint8_t n_deref4 = n_var0->ind;
    
    mavlink_pack_uint8_t((uint8_t*) n_ref1, 8U, n_deref4);
    for (int32_t n_ix5 = 0; n_ix5 <= 8; n_ix5++) {
        ASSERTS(n_ix5 > 0 && 2147483647 - n_ix5 >= 6 || n_ix5 <= 0);
        if (n_ix5 + 6 >= 80) { } else {
            uint8_t n_deref6 = n_ref1[n_ix5];
            
            ASSERTS(n_ix5 > 0 && 2147483641 >= n_ix5 || n_ix5 <= 0);
            ASSERTS(0 <= 6 + n_ix5 && 6 + n_ix5 < 80);
            *&n_var2[(6 + n_ix5) % 80] = n_deref6;
        }
    }
    mavlinkSendWithWriter(254U, 46U, 9U, n_var1, n_var2);
    for (int32_t n_ix7 = 0; n_ix7 <= 62; n_ix7++) {
        ASSERTS(n_ix7 > 0 && 2147483647 - n_ix7 >= 17 || n_ix7 <= 0);
        ASSERTS(0 <= n_ix7 + 17 && n_ix7 + 17 < 80);
        *&n_var2[(n_ix7 + 17) % 80] = 0U;
    }
    return;
}

void mavlink_debug_unpack(struct debug_msg* n_var0, const uint8_t* n_var1)
{
    uint32_t n_r0 = mavlink_unpack_uint32_t(n_var1, 0U);
    
    *&n_var0->time_boot_ms = n_r0;
    
    float n_r1 = mavlink_unpack_float(n_var1, 4U);
    
    *&n_var0->value = n_r1;
    
    uint8_t n_r2 = mavlink_unpack_uint8_t(n_var1, 8U);
    
    *&n_var0->ind = n_r2;
}