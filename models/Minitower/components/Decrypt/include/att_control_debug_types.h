/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.3
 */
#ifndef __ATT_CONTROL_DEBUG_TYPES_H__
#define __ATT_CONTROL_DEBUG_TYPES_H__
#ifdef __cplusplus
extern "C" {
#endif
#include "ivory.h"
#include "ivory_serialize.h"
typedef struct att_control_debug { float head_setpt;
                                   float head_rate_setpt;
                                   float head_ctl_p;
                                   float head_ctl_d;
                                   float pitch_setpt;
                                   float pitch_rate_setpt;
                                   float roll_setpt;
                                   float roll_rate_setpt;
} att_control_debug;
void att_control_debug_get_le(const uint8_t *n_var0, uint32_t n_var1, struct att_control_debug *n_var2);
void att_control_debug_get_be(const uint8_t *n_var0, uint32_t n_var1, struct att_control_debug *n_var2);
void att_control_debug_set_le(uint8_t *n_var0, uint32_t n_var1, const struct att_control_debug *n_var2);
void att_control_debug_set_be(uint8_t *n_var0, uint32_t n_var1, const struct att_control_debug *n_var2);

#ifdef __cplusplus
}
#endif
#endif /* __ATT_CONTROL_DEBUG_TYPES_H__ */