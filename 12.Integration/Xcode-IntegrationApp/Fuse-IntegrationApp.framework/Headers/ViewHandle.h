#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

typedef void(^Callback)(NSDictionary<NSString*,NSString*>*);

@interface ViewHandle : NSObject

@property (readonly) UIView* view;

-(void) setDataJson:(NSString*)json;
-(void) setCallback:(Callback)callback forKey:(NSString*)key;

@end